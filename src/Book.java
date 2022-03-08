public enum Book {

    History1(100,1990,"History1","Abdullah"),
    History2(50,1990,"History2","Beril"),
    History3(300,1990,"History3","Canan"),
    History4(400,1990,"History4","Çağatay"),
    History5(50,1990,"History5","Deniz"),
    History6(600,1990,"History6","Enes Emre"),
    History7(700,1990,"History7","Ferhat"),
    History8(80,1990,"History8","Gamze"),
    History9(900,1990,"History9","Hazal"),
    History10(1050,1990,"History10","İbrahim");


    private int page;
    private int year;
    private String name;
    private String author;

    private Book(int page, int year, String name, String author){

        this.page = page;
        this.year = year;
        this.name = name;
        this.author = author;

    }

    public int getPage(){
        return page;
    }
    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    
}
