
package atmajakalkulatorsederhana;

//Java util Scanner untuk library inputan
import java.util.Scanner; 

/**
 *
 * @author ATMAJA JNK
 */
public class AtmajaKalkulatorSederhana {

    public static void main(String[] args) {
        //Namakan scanner dengan scanner input
        Scanner input = new Scanner(System.in);
        
        //Untuk Iputan Nama
        System.out.print("Masukan Nama Anda : ");
        String nama = input.nextLine();
        
        //Inputan Saldo
        System.out.print("Masukan Saldo Anda : ");
        int saldo = input.nextInt();
        
        //untuk mengatur batas transaksi hany boleh dilakukan 5 kali
        short batasTransaksi = 5;
        
        //Kondisi awal adalah batas transksi akan default yaitu 0
        while(batasTransaksi > 0){
            int saldoSekarang = saldo;
            //Menur Transaksi
            System.out.print("Menu Transaksi\n"
                    +"1. Penarikan\n"
                    +"2. Menabung\n"
                    +"Pilih Transaksi[1/2] : ");
            String menu = input.next();
            
            //Logika IF jika ingin melakukan penarikan
            if(menu.equalsIgnoreCase("1")){
                System.out.println("Anda akan melakukan Penarikan Tunai\n"
                    +"Saldo Anda adalah Rp. "
                    +saldoSekarang);
                System.out.print("Masukan jumlah penarikan : ");
                int penarikan = input.nextInt();
                
                //pengurangan salddo jika diambil dan tidak boleh saldo dibawah 5000
                if(saldo - penarikan < 5000){
                    System.out.println("Sisa saldo harus Rp. 5000");
                   
                }else if (penarikan < 2000){
                    
                    System.out.println("penarikan minimal harus Rp. 2000");
                }else{saldo = saldo - penarikan;
                    System.out.println("Saldo awal anda adalah Rp. "
                    + saldoSekarang +". Anda melakukan penarikan sebesar Rp. "
                    + penarikan);
                }
                System.out.println("Sisa saldo adalah Rp. "
                        + saldo 
                        + ". Sisa transaksi anda masih "
                        +(batasTransaksi)
                        +" kali.");
               
            }else if(menu.equalsIgnoreCase("2")){
                System.out.println("Anda akan melakukan Penabungan\n"
                    +"Saldo Anda adalah Rp. "
                    +saldoSekarang);
                System.out.print("Masukan jumlah uang  : ");
                int penambahan = input.nextInt();
                
                if(penambahan < 2000){
                    System.out.println("Penabungan harus minimal Rp. 2000");
                    
                }else{saldo = saldo + penambahan;
                    System.out.println("Saldo awal anda adalah Rp. "
                    + saldoSekarang +". Anda melakukan penbungan sebesar Rp. "
                    + penambahan);
                }
                
                System.out.println("Jumlah saldo adalah Rp. "
                        + saldo 
                        + ". Sisa transaksi anda masih "
                        +(batasTransaksi -1)
                        +"kali.");
                
            }else{
                System.out.println("Maaf, Menu transaksi yang anda pilih tidak ada!");
            }
        
            //step
            System.out.print("Apakah anda ingin melakukan transaksi lagi? [y/n] : ");
            String pilihan = input.next();
            
            if(pilihan.equalsIgnoreCase("y")){
                System.out.println("Sisa transaksi anda masih "
                        + (batasTransaksi -1));
                
                batasTransaksi--;
            }else if(pilihan.equalsIgnoreCase("n")){
                System.out.println("Anda akan membatalkan Transaksi!");
                batasTransaksi = 0;
               
            }else{
                System.out.println("Pilihan tidak ada");
                batasTransaksi = 0;
            }
        }
    }
    }


