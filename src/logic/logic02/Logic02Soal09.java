package logic.logic02;

import logic.BasicLogic;

public class Logic02Soal09 extends BasicLogic {
    public Logic02Soal09(int n) {
        super(n);
    }

    public void isiArray(){
        int nilaiTengah = this.n/2;
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j-i <= nilaiTengah && i-j <= nilaiTengah &&
                        i+j >= nilaiTengah && i+j <= nilaiTengah + n-1 ){
                    this.array[i][j] = String.valueOf(angka);
                }
            }
        }
    }

    public void cetakArray(){
        this.isiArray();
        this.print();
    }
}

