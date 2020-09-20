public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Иван Авинов","iiiaaa@mail.ru",'М');
        System.out.println(author);
        author.setEmail("aaaiii@mail.ru");
        System.out.println(author);
    }
}
