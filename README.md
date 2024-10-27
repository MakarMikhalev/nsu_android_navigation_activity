# Android Navigation between Activities A, B, and C

## Задание
Реализовать навигацию между тремя экранами `A`, `B` и `C` с учетом следующих требований:
1. **Навигация по кнопке**:
   - Экран `A` -> Экран `B` -> Экран `C`
   - Экран `C` -> Экран `A`
2. **Поведение кнопки "Назад"**:
   - На экране `A` кнопка "Назад" закрывает приложение.
   - На экранах `B` и `C` кнопка "Назад" возвращает на предыдущий экран.
3. **Условия**:
   - Фрагменты не используются.
   - Запуск активности выполняется с помощью `activityLaunchMode`.
