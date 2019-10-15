
 public class NewClass {

    private String name;
    private int age;
    private String myAddr;
    private int height;

    NewClass(String n, int a, String m, int h) {
        name = n;
        age = a;
        myAddr = m;
        height = h;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getMyAddr() {
        return myAddr;
    }

    int getHeight() {
        return height;
    }

    void addAge(int a) {
        age += a;
        System.out.println("나이배달");
    }

    void addHeight(int h) {
        height += h;
        System.out.println();
    }
}
class KakaoFriends{
        public static void main(String[] args) {
            NewClass apeach = new NewClass("어피치",37, "판교", 150);
            NewClass crong = new NewClass("크롱",13,"평택",155);

            apeach.addAge(2);
            crong.addHeight(10);

            System.out.println(apeach.getName() + apeach.getAge() + apeach.getMyAddr() + apeach.getHeight());
        }
}

