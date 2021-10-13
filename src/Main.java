import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    List<User> userList = new ArrayList<User>();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan jumlah user: ");
    int userQuantity = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < userQuantity; i++) {
      User newUser = new User();
      System.out.println("Masukkan identitas user");
      System.out.println("Nama: ");
      newUser.setName(scanner.nextLine());
      System.out.println("Email: ");
      newUser.setEmail(scanner.nextLine());
      System.out.println("Location: ");
      newUser.setLocation(scanner.nextLine());
      userList.add(newUser);
    }
    System.out.println("Daftar user: ");
    System.out.println(userList);
  }
}
