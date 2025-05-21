/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aurel
 */
import java.util.Scanner;
import java.util.InputMismatchException;

// 1. Custom checked exception
class IndexNegatifException extends Exception {
    public IndexNegatifException(String pesan) {
        super(pesan);
    }
}

public class ExceptionHandlingChecked0 {

    // 2. Method sekarang melempar checked exception
    public static void cekIndex(int index) throws IndexNegatifException {
        if (index < 0){
            throw new IndexNegatifException("Index tidak boleh negatif");
        }
    }

    public static void main(String[] args){
        Scanner array = new Scanner(System.in);
        int[] a = {1, 2, 3};

        try {
            System.out.print("Masukkan index array yang ingin diakses: ");
            int index = array.nextInt();

            // 3. Tangani checked exception ini
            cekIndex(index);

            System.out.println("Nilai index ke-" + index + " adalah: " + a[index]);
        } catch(InputMismatchException e) {
            System.out.println("Terjadi exception: Input Mismatch! Masukkan angka bertipe integer");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception: Array Index Out Of Bounds!");
        } catch(IndexNegatifException e){
            System.out.println("Terjadi exception: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan");
        }

        System.out.println("Program selesai.");
    }
}

}