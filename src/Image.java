public class Image {
    
    private int size;
    private String[] tags = new String[100];
    private boolean vertical;

    public Image (int size, String[] tags, boolean vertical) {
        this.size = size;
        this.tags = tags;
        this.vertical = vertical;
    }

    public int getSize() {
        return size;
    }

    public String[] getTags() {
        return tags;
    }

    public boolean getVertical() {
        return vertical;
    }
}
