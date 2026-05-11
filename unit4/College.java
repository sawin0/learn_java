package unit4;

public class College implements University {

    @Override
    public void teach() {
        System.out.println("Teaching students on the college...");
    }

    @Override
    public void publishMarks() {
        System.out.println("Publishing students marks....");
    }

    public void lendBooks(){
        System.out.println("lending books to the students...");
    }

    public static void main(String[] args) {
        College c1 = new College();
        c1.teach();
        c1.publishMarks();
    }

}
