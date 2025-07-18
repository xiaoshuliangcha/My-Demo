package DouDiZhu;

public class Card {
    private String size;
    private String color;
    private int num;//��С


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
     * ��ȡ
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * ����
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * ��ȡ
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * ����
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return size+color;
    }

    /**
     * ��ȡ
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * ����
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }
}
