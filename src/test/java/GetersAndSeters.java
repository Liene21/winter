import org.testng.annotations.Test;

public class GetersAndSeters {

        @Test
        public void workingWithBag() {
            Bag firstBag = new Bag();
            firstBag.setColor("Red");
            firstBag.setMaterial("Leather");
            firstBag.setLength(35.5);
            firstBag.setHeight(25.5);

            Bag secondBag = new Bag();
            secondBag.setColor("Blue");
            secondBag.setMaterial("Textile");
            secondBag.setLength(32.5);
            secondBag.setHeight(28.4);



        System.out.println("1st bag:");
        System.out.println(firstBag.getColor());
            System.out.println(firstBag.getMaterial());

            System.out.println("2st bag:");
            System.out.println(secondBag.getColor());
            System.out.println(secondBag.getMaterial());




    }
}
