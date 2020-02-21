package D0210;

import java.util.Scanner;

public class WanNianLi {
    public static void main(String[] args){
        //思路：
        //1、构建Scanner扫描器类的对象
        Scanner input = new Scanner(System.in);

        //2、从控制台接收用户录入的年份、月份
        System.out.println("输入年");
        int year  = input.nextInt();
        System.out.println("输入月");
        int month  = input.nextInt();

        //3、获得1900年距离当前年份上一年的总天数
        int totalDays = getFromNowYearTo1900TotalDays(year);

        //4、获得当前年份所经过的天数
        int totalDaysThisYear = getNowYearPassedTotalDays(year,month);

        //5、求得给定月份第一天的星期数
        int week = (totalDays + totalDaysThisYear +1) % 7;//星期日是，week = 0

        //6、格式化输出日历
        formatCalendarOutput(week,year,month);
    }

    /**
     *格式化输出日历
     *@param week:当前月份第一天的星期数
     *@param year:当前年份
     *@param month:当前月份
     */
    public static void formatCalendarOutput(int week,int year,int month){
        int cnt = 0;//计数器，记录空白数和日期数的和
        //1) 打印表头
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
        //2）打印空白（观察星期与之前空个数之间的规律）
        for(int i=1;i<= week;i++){
            System.out.print("\t\t");
            cnt++;
        }
        //3) 打印日历
        for(int i=1;i<=getNowMonthDays(year,month);i++){
            System.out.print(i+"\t\t");
            cnt++;
            //若记录空白数和日期数的和是七的倍数，应该换行输出
            if(cnt % 7 == 0){
                System.out.println();
            }
        }
    }
    /**
     *判断给定的年份是否为闰年
     *@param year:给定的年份
     *@return true:闰年；false：平年
     */
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     *根据参数指定的年份，月份，求出当前月的总天数
     *@param year:年份
     *@param month:月份
     *@return 月的总天数
     */
    public static int getNowMonthDays(int year,int month){//year:设计该参数的原因，2月份根据年份是否是闰年来确定其天数的
        switch(month){
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    /**
     *获得当前年份的上一年距离1900年所经过的总天数
     *@param year 当前年份
     *@return 总天数
     */
    public static int getFromNowYearTo1900TotalDays(int year){
        int totalDays = 0;
        for(int i = 1900; i< year; i++){//i:年份
            totalDays += isLeapYear(i) ? 366 : 365;
        }
        return totalDays;
    }

    /**
     *求出当前年份经过的总天数（从当前年的1月1日到给定月份的上一个月最末一天）
     *@param year:年份
     *@param month:月份
     *@return 总天数
     */
    public static int getNowYearPassedTotalDays(int year,int month){
        int totalDays = 0;
        for(int i=1;i< month;i++){//i:月份
            totalDays += getNowMonthDays(year,i);
        }
        return totalDays;
    }
}
