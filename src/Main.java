public class Main {

    public static void main(String[] args) {
        {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Ф.И.О. сотрудника - " + fullName);
        }
        {
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        }
        {
            String fullName = "Иванов Семён Семёнович";
            System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));
        }
    }
}