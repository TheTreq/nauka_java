[← powrót do spisu treści](../00-Index.md)

# SYSTEM I NARZĘDZIA — Snap, APT, ustawienia

> To nie jest ściśle Java — to komendy systemowe (Ubuntu/Linux), które pojawiły się po drodze przy konfigurowaniu narzędzi do nauki.

## APT vs Snap — dwa menadżery pakietów na Ubuntu

**APT** — klasyczny sposób instalowania programów na Ubuntu/Debianie. Paczki `.deb` **dzielą** między sobą biblioteki systemowe.
> Jak wspólna wypożyczalnia narzędzi w bloku — wszyscy korzystają z tej samej wiertarki na korytarzu. Oszczędza miejsce, ale czasem dwa programy chcą innej wersji tej samej "wiertarki" naraz i robi się konflikt.

**Snap** — nowszy system od Canonical (firma robiąca Ubuntu). Każda paczka pakuje **wszystkie swoje zależności w sobie**, nic nie dzieli z innymi programami. Działa w piaskownicy (sandbox) — odizolowanym środowisku, dla bezpieczeństwa.
> Jak zapieczętowana, własna skrzynka narzędzi. Więcej miejsca na dysku (duplikuje biblioteki), ale zero konfliktów wersji.

Oba żyją sobie równolegle na tym samym systemie — nie trzeba wybierać, używa się tego, w jakim dany program jest akurat dostępny.

### `sudo snap install <nazwa> --classic`
```bash
sudo snap install obsidian --classic
```
- `sudo` — uruchom jako administrator (instalacja programów tego wymaga)
- `snap install` — poproś Snapa o zainstalowanie paczki
- `obsidian` — nazwa paczki
- `--classic` — wyłącza piaskownicę. Normalnie snap nie ma dostępu do dowolnego miejsca na dysku, ale programy typu edytor/notatnik (Obsidian, IntelliJ) muszą móc otworzyć KAŻDY folder który im wskażesz — stąd `--classic`

### `snap list`
Pokazuje wszystkie paczki zainstalowane przez Snapa na systemie. Kolumny: nazwa, wydawca, wersja, numer rewizji (ile razy aktualizowana), kanał śledzenia, notatki (np. czy ma tryb `classic`).
> Przydatne do sprawdzenia czy instalacja czegoś faktycznie się udała, zanim zaczniesz szukać problemu gdzie indziej.

---

## Ustawienia zasilania — wygaszanie/przyciemnianie ekranu

Dwie ścieżki do tego samego celu:

**GUI:** Ustawienia → Zasilanie → wyłącz "Przyciemnij ekran", zmień "Pusty ekran" na inną wartość (np. "Nigdy").

**Terminal:**
```bash
gsettings set org.gnome.desktop.session idle-delay 0
gsettings set org.gnome.settings-daemon.plugins.power idle-dim false
```
- `gsettings set` — zmień jedno konkretne ustawienie systemowe GNOME (środowisko graficzne Ubuntu)
- `org.gnome.desktop.session idle-delay 0` — po ilu sekundach bezczynności wygasić ekran; `0` = nigdy
- `org.gnome.settings-daemon.plugins.power idle-dim false` — czy przyciemniać ekran przed wygaszeniem; `false` = wyłączone

> ⚠️ Na laptopie: wyłączenie wygaszania na stałe oznacza że ekran żre prąd bez przerwy, jeśli pracujesz na baterii bez ładowarki.

---

## Restart systemu

GNOME **nie ma domyślnego skrótu klawiszowego** na restart — celowo, żeby nie zrobić tego przez przypadek.

**GUI:** ikonki w prawym górnym rogu ekranu (zasilanie/sieć/dźwięk) → ikona zasilania → Uruchom ponownie.

**Terminal:**
```bash
systemctl reboot
```
- `systemctl` — narzędzie do zarządzania usługami i stanem systemu (systemd, to co "spina" cały Linux przy starcie/zamykaniu)
- `reboot` — polecenie dla systemctl: zrestartuj system

> ⚠️ Restartuje NATYCHMIAST, bez okna z potwierdzeniem — zapisz wszystko zanim wciśniesz Enter.

Własny skrót klawiszowy: Ustawienia → Skróty klawiszowe → Niestandardowe skróty → podpięta pod wybraną kombinację komenda `systemctl reboot`.

---

[← powrót do spisu treści](../00-Index.md)
