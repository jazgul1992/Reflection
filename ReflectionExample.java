import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Получаем класс String
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим названия и сигнатуры методов
        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}

