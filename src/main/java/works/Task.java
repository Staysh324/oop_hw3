package works;
import java.util.ArrayList;
import java.util.List;
public class Task {
    public static void main(String[] args) {
        Box box1 = new Box(254);
        Box box2 = new Box(884);
        Box box3 = new Box(164);
        Box box4 = new Box(468);
        Box box5 = new Box(468);

        List<Box> boxes = new ArrayList<>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        Container container = new Container(boxes);

        System.out.println("общий вес контейнера = " + container.getTotalWeight());

        System.out.println("вес каждой коробки:");
        int count = 1;
        for (Box box : container) {
            System.out.println(count + "я " + box);
            count += 1;
        }
    }
}
