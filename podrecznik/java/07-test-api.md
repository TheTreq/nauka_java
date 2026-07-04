[← powrót do spisu treści](../00-Index.md)

# TEST API vs TEST MANUALNY

## Restauracja jako analogia

- **Test manualny** (klasyczne testowanie gotowej appki) = siadasz przy stoliku, zamawiasz przez kelnera, jesz, oceniasz smak i wygląd dania. Oceniasz całe doświadczenie przez ludzki interfejs (menu, stolik, talerz).
- **Test API** = pomijasz cały lokal — dzwonisz bezpośrednio do kuchni (wysyłasz "zamówienie", czyli *request*, prosto do serwera), i sprawdzasz tylko: czy przyszła odpowiedź, czy to jest dokładnie to, co zamówiłeś (dane w odpowiedzi), i czy kuchnia nie zgłosiła błędu (status). Żadnego stolika, talerza, wyglądu — liczy się tylko **komunikacja między programami**.

## Test API = automatyczny, nie wizualny

- Wysyłasz request pod konkretny adres w internecie (endpoint)
- Dostajesz odpowiedź, zwykle w formacie JSON
- Sprawdzasz to w kodzie, automatycznie, bez człowieka klikającego cokolwiek

> Szczegóły (HTTP, endpoint, status, JSON) poznamy dokładnie w Module 3 (Lekcja 10+) — na razie liczy się sama idea: test API rozmawia z programem, test manualny z człowiekiem-użytkownikiem przez ekran.

---

[← powrót do spisu treści](../00-Index.md)
