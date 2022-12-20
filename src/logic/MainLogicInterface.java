package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.*;
import logic.logicInterface.logic02Impl.*;

public class MainLogicInterface {
    public static void main(String[] args) {
        int val = 9;

        System.out.println(">> Logic 02");

        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(val));
        logic01Soal01.cetakArray();

        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(val));
        logic01Soal04.cetakArray();

        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(val));
        logic02Soal01.cetakArray();

        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(val));
        logic02Soal02.cetakArray();
    }
}

