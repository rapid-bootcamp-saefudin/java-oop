package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal04Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal04Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int n = 1;
        int n2 = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array[0][i]= String.valueOf(n);
            int jumlahN = n + n2;
            n = n2;
            n2 = jumlahN;
        }
        System.out.println();
    }

    public void cetakArray(){
        this.isiArray();
        this.logic.printSingle();
    }
}