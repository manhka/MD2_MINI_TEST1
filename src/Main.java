public class Main {
    static double totalPriceOfprogrammingBooks = 0;
    static double totalPriceOffictionBooks = 0;
    static int count = 0;

    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook("MX123", "book1", 50000, "PHẠM  HUY HOÀNG", "java", "ABC");
        programmingBooks[1] = new ProgrammingBook("MX124", "book2", 60000, "NGUYỄN VĂN B", "java", "BGF");
        programmingBooks[2] = new ProgrammingBook("MX125", "book3", 70000, "NGUYỄN THỊ C", "php", "DAS");
        programmingBooks[3] = new ProgrammingBook("MX126", "book4", 80000, "PHẠM QUỐC SỰ", "python", "KJL");
        programmingBooks[4] = new ProgrammingBook("MX127", "book5", 90000, "CAO QUỐC OAI", "java", "MUY");
        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook("AbC123", "BOOK1", 20000, "NGUYEN VAN A", "ACADEMY");
        fictionBooks[1] = new FictionBook("AbC124", "BOOK2", 30000, "NGUYEN VAN B", "ACADEMY");
        fictionBooks[2] = new FictionBook("AbC125", "BOOK3", 40000, "NGUYEN VAN C", "ACADEMY");
        fictionBooks[3] = new FictionBook("AbC126", "BOOK4", 5000, "NGUYEN VAN D", "ACADEMY");
        fictionBooks[4] = new FictionBook("AbC127", "BOOK5", 60000, "NGUYEN VAN S", "ACADEMY");
        for (int i = 0; i < programmingBooks.length; i++) {
            totalPriceOfprogrammingBooks += programmingBooks[i].price;
            if (programmingBooks[i].getLanguage().equals("java")) {
                count++;
            }
        }

        for (int i = 0; i < fictionBooks.length; i++) {
            totalPriceOffictionBooks += fictionBooks[i].price;
        }
        System.out.println("-TOTAL PRICE OF programmingBooks =" + totalPriceOfprogrammingBooks + " VND");
        System.out.println("-TOTAL PRICE OF fictionBooks =" + totalPriceOffictionBooks + " VND");
        System.out.println("-THE NUMBER OF ProgrammingBooks ARE WRITE BY JAVA LANGUAGE :" + count + " BOOKS");
    }


}
