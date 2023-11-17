interface AuthenticationService {
    /**
     * Метод для аутентификации пользователя по имени пользователя и паролю.
     *
     * @param username Имя пользователя.
     * @param password Пароль пользователя.
     * @return true, если аутентификация успешна, иначе false.
     */
    boolean authenticate(String username, String password);
}
