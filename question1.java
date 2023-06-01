import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Due
        System.out.print("Enter due (dd/mm/yy) = ");
        String due = input.nextLine();

        // Returned
        System.out.print("Enter returned (dd/mm/yy) = ");
        String returned = input.nextLine();

        // Variabel Date
        Date date = null;
        Date kembali = null;
        // Mengubah input menjadi tanggal
        SimpleDateFormat inputFormat = new SimpleDateFormat("d M yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
        // Due Format
        try {
            date = inputFormat.parse(due);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Gunakan variabel di luar blok try
        if (date != null) {
            String formattedDate = outputFormat.format(date);
            System.out.println(formattedDate);
        }
        // Returned Format
        try {
            kembali = inputFormat.parse(returned);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Gunakan variabel di luar blok try
        if (kembali != null) {
            String formattedDate = outputFormat.format(kembali);
            System.out.println(formattedDate);
        }

        // Due - Returned
        long differenceInDays = 0;
        input.close();
        try {
            // Date date1 = dateFormat.parse(date1String);
            // Date date2 = dateFormat.parse(date2String);

            long differenceInMilliseconds = Math.abs(kembali.getTime() - date.getTime());
            differenceInDays = TimeUnit.DAYS.convert(differenceInMilliseconds, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Menghitung denda
        if (differenceInDays == 0) {
            System.out.println("0");
        } else if (differenceInDays > 0 && differenceInDays <= 30) {
            System.out.println(differenceInDays * 15);
        } else if (differenceInDays > 30 && differenceInDays <= 365) {
            Long bulan = differenceInDays / 30;
            System.out.println(bulan * 500);
        } else if (differenceInDays > 365) {
            long bulan = differenceInDays / 365;
            System.out.println(bulan * 1200);
        }
    }

}