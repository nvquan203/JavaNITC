import java.util.Scanner;
import java.lang.Math;

import tamgiac.*;
import vuong.*;
import hcn.*;
import thoi.*;
import hbh.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Tamgiac tamgiac = new Tamgiac();
        System.out.print("Do dai 3 canh tam giac: ");
        tamgiac.a = scanner.nextDouble();
        tamgiac.b = scanner.nextDouble();
        tamgiac.c = scanner.nextDouble();
        if (tamgiac.kiemtra() == true)
        {
            System.out.println("-> Chu vi tam giac: " + tamgiac.cv());
            System.out.println("-> Dien tich tam giac: " + tamgiac.dt());
        }
        else {
            System.out.println("Invalid");
        }

        Vuong vuong = new Vuong();
        System.out.print("Do dai canh hinh vuong: ");
        vuong.x = scanner.nextDouble();
        System.out.println("-> Chu vi hinh vuong: " + vuong.cv());
        System.out.println("-> Dien tich hinh vuong: " + vuong.dt());

        Hcn hcn = new Hcn();
        System.out.print("Do dai 2 canh hinh chu nhat: ");
        hcn.x = scanner.nextDouble();
        hcn.y = scanner.nextDouble();
        System.out.println("-> Chu vi hinh chu nhat: " + hcn.cv());
        System.out.println("-> Dien tich hinh chu nhat: " + hcn.dt());

        Thoi thoi = new Thoi();
        System.out.print("Do dai 2 duong cheo hinh thoi: ");
        thoi.x = scanner.nextDouble();
        thoi.y = scanner.nextDouble();
        System.out.println("-> Chu vi hinh thoi: " + thoi.cv());
        System.out.println("-> Dien tich hinh thoi: " + thoi.dt());

        Hbh hbh = new Hbh();
        System.out.print("Do dai 2 canh hinh binh hanh va chieu cao: ");
        hbh.x = scanner.nextDouble();
        hbh.y = scanner.nextDouble();
        hbh.h = scanner.nextDouble();
        System.out.println("-> Chu vi hinh binh hanh: " + hbh.cv());
        System.out.println("-> Dien tich hinh binh hanh: " + hbh.dt());
    }
}
