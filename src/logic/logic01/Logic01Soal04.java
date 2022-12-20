package logic.logic01;

import logic.BasicLogic;

public class Logic01Soal04 extends BasicLogic {
    public Logic01Soal04(int n) {
        super(n);
    }

    public void isiArray() {
        int n = 1;
        int n2 = 1;
        for (int i = 0; i < this.n; i++) {
            this.array[0][i]= String.valueOf(n);
            int jumlahN = n + n2;
            n = n2;
            n2 = jumlahN;
        }    }

    public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
