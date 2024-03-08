class MusicFile {
    String file = "Music file";
}

class ImageFile {
    String file = "Image file";
}

class TextFile {
    String file = "Text file";
}

public class OverloadedMethods {
    public void openFile(MusicFile mf){
        System.out.println("Opening a file -> " + mf.file);
    }

    public void openFile(ImageFile imf){
        System.out.println("Opening a file -> " + imf.file);
    }

    public void openFile(TextFile tf){
        System.out.println("Opening a file -> " + tf.file);
    }

    public static void main(String args[]){
        OverloadedMethods obj1 = new OverloadedMethods();

        MusicFile mf1 = new MusicFile();
        ImageFile imf1 = new ImageFile();
        TextFile tf1 = new TextFile();

        obj1.openFile(mf1);
        obj1.openFile(imf1);
        obj1.openFile(tf1);
    }

}
