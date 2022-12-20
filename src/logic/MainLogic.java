package logic;

import logic.logic01.*;
import logic.logic02.*;

public class MainLogic {
    public static void main(String[] args) {
        int val = 5;

        System.out.println(">> Logic 01\n");

        Logic01Soal01 logic01Soal01 = new Logic01Soal01(val);
        logic01Soal01.cetakArray();

        Logic01Soal02 logic01Soal02 = new Logic01Soal02(val);
        logic01Soal02.cetakArray();

        Logic01Soal03 logic01Soal03 = new Logic01Soal03(val);
        logic01Soal03.cetakArray();

        Logic01Soal04 logic01Soal04 = new Logic01Soal04(val);
        logic01Soal04.cetakArray();

    }
}
