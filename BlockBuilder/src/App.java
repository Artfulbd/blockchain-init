public class App {
    public static void main(String[] args) throws Exception {
        // Genesis block
        Block first = new Block(0, "Genesis block data");
        Block test_block = new Block(0, "Genesis block data1");
        System.out.println("first:"+first.getHesh());
        System.out.println("test:"+test_block.getHesh());
    }
}
