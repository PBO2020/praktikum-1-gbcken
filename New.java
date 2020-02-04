import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;

public class New{

	ArrayList<ken> k = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	BufferedReader inp = new BufferedReader(new
	InputStreamReader(System.in));

	String nik,nama,ttl,jk;
        int goldar;

	public static void main(String [] args){
		New a = new New();
		a.menu();
	}

	public void menu(){
		int pilih = 0;
		do{
			System.out.println("1>Inputkan Data");
			System.out.println("2>Tampil Data");
			System.out.println("3>Keluar");
			System.out.println("Pilihan menu :   ");
				pilih = input.nextInt();
			switch(pilih){
				case 1 :
				InputkanData();
				break;
				case 2 :
				TampilData();
				break;
				case 3 :
				System.exit(0);
				break;
				default :

				System.out.println("Maaf , inputan yang anda masukan salah");
			}
		}while(pilih !=3);

		}

	void InputkanData(){
		System.out.print("Nik : ");
		nik = input.next();
		System.out.print("Nama : ");
		nama = input.next();
		System.out.print("TTL : ");
		ttl = input.next();
                System.out.print("Jenis Kelamin : ");
		jk = input.next();
                System.out.print("Goldar : ");
		goldar = input.nextInt();
                
		ken a = new ken(nik, nama, ttl, jk, goldar);
		k.add(a);

	}

	void TampilData(){
        if (k.isEmpty() == true) {
            System.out.println("Data kosong");
            menu();
        } else {
           
            for (int i = 0; i < k.size(); i++) {
                System.out.println("NIK                   : " + k.get(i).getNik());
                System.out.println("Nama                  : " + k.get(i).getNama());
                System.out.println("Tempat, tanggal lahir : " + k.get(i).getTtl());
                System.out.println("Jenis kelamin         : " + k.get(i).getJk());
                if(k.get(i).getGoldar() == 1){
                    System.out.println("Golongan darah        : A");
                }else if (k.get(i).getGoldar() == 2){
                    System.out.println("Golongan darah        : B");
                }else if (k.get(i).getGoldar() == 3){
                    System.out.println("Golongan darah        : AB");
                }else if (k.get(i).getGoldar() == 4){
                    System.out.println("Golongan darah        : O");
                }
            }
            menu();
        }

	}
}