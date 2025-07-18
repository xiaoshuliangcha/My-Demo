package DouDiZhu;

public class Card {
    private String size;
    private String color;
    private int num;//大小


    public Card() {
    }

    public Card(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public Card(String size, String color, int num) {
        this.size = size;
        this.color = color;
        this.num = num;
    }

    /**
     * 获取
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return size+color;
    }

    /**
     * 获取
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }
}
