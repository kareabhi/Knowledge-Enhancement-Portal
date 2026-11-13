public class Course {
    private int id;
    private String title;
    private String category;

    public Course(int id, String title, String category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }

    public void showCourse() {
        System.out.println(id + ". " + title + " [" + category + "]");
    }
}
