package max;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("손오공", "111");
        Student st2 = new Student("저팔계", "222");
        Student st3 = new Student("사오정", "333");

        ArrayList<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("계속 검색을 하고 싶으면 y, 종료하고싶으면 n");
            String input = scan.next();
            if(input.equals("y")){
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                boolean flag = false;

                for (Student stu :  list) {
                    if (stu.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번은 : "+stu.getNo());
                        flag = true;
                    }
                }
                if (!flag) System.out.println("대상자가 존재하지 않습니다.");


            } else if(input.equals("n")){
                break;
            }
        }
        System.out.println("검색을 종료합니다.");
    }
}
