package Green;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Calendar;

import java.time.*;
import java.text.SimpleDateFormat;

/**
 * @author GGG
 * 이번달 달력 출력
 *
 * 사용자 입력을 받아 원하는 년/월의 달력 출력하기
 */
public class PrintCal {
    public void make() {

        Scanner scanner = new Scanner(System.in);

        //원하는 년,월 입력받기
        System.out.println("년도를 입력하세요");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요");
        int month = scanner.nextInt();

        //someday = 원하는 날짜 설정 ex)2000-06-01
        LocalDate someday = LocalDate.of(year, month, 1);



        //lastDate = someday에서 일수를 그 달의 마지막 일로 변경  ex)2000-06-30
        LocalDate lastDate = someday.withDayOfMonth(someday.lengthOfMonth());
        //last = lastDate에서 마지막일만 따로 분리 ex)2000-06-30 -> 30
        int last = lastDate.getDayOfMonth();

        //someday에서 그 달의 첫번째 날읠 분리
        LocalDate firstDate = someday.withDayOfMonth(1);
        //firstDate의 요일을 String으로 변환
        String fistDayOfWeek = firstDate.getDayOfWeek().toString();


        System.out.printf
                ("%c   %c   %c  %c   %c   %c   %c",'일','월','화','수','목','금','토');
        System.out.println();
        if(fistDayOfWeek.equals("SUNDAY")) {
            int i =1;
            while(i<=last) {
                if((i==15) || (i==22) || (i==29)) {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("MONDAY")) {
            int i =1;
            for(int j=0;j<2;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i%7==0) && (i>=7)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("TUESDAY")) {
            int i =1;
            for(int j=0;j<4;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i==6) || (i==13) || (i==20) || (i==27)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("WEDNESDAY")) {
            int i =1;
            for(int j=0;j<6;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i==5) || (i==12) || (i==19) || (i==26)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("THURSDAY")) {
            int i =1;
            for(int j=0;j<8;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i==4) || (i==11) || (i==18) || (i==25)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("FRIDAY")) {
            int i =1;
            for(int j=0;j<10;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i==3) || (i==10) || (i==17) || (i==24) || (i==31)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }
        if(fistDayOfWeek.equals("SATURDAY")) {
            int i =1;
            for(int j=0;j<12;j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            while(i<=last) {
                if((i==2) || (i==9) || (i==16) || (i==23) || (i==30)) {
                    System.out.println();
                }
                System.out.printf("%02d",i);
                System.out.print(" ");
                System.out.print(" ");
                i++;
            }
        }

    }
    public static void main(String[] args) {
        PrintCal printCal = new PrintCal();
        printCal.make();

    }

}
