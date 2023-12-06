abstract class Person {
    /**
     * Имя человека.
     */
    private String name;

    /**
     * Возраст человека.
     */
    private int age;

    /**
     * Инициализация.
     *
     * @param name Имя человека.
     * @param age  Возраст человека.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттер имени человека.
     *
     * @return Имя человека.
     */
    public String getName() {
        return name;
    }

    /**
     * Сеттер имени человека.
     *
     * @param name Новое имя человека.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Геттер возраста человека.
     *
     * @return Возраст человека.
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер возраста человека.
     *
     * @param age Новый возраст человека.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
