public class SimpleAuthenticationService implements AuthenticationService {
    /**
     * Верный логин.
     */
    private static final String VALID_USERNAME = "user123";
    /**
     * Верный пароль.
     */
    private static final String VALID_PASSWORD = "password123";

    /**
     * Метод для аутентификации пользователя по имени пользователя и паролю.
     *
     * @param username Имя пользователя.
     * @param password Пароль пользователя.
     * @return true, если аутентификация успешна, иначе false.
     */
    @Override
    public boolean authenticate(String username, String password) {
        // Пример простой аутентификации
        return VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password);
    }
}
