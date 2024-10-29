## Encapsulated Fields

Di dalam kelas CurrencyConverter, exchangeRates diubah menjadi encapsulated field dengan menambahkan getter (getExchangeRates) dan setter (setExchangeRates). Encapsulation memastikan akses ke field exchangeRates hanya dilakukan melalui metode yang telah ditentukan, sehingga memudahkan pengelolaan akses data secara terstruktur.
Rename Field: 

Nama exchangeRates digunakan untuk mendeskripsikan lebih baik mengenai field tersebut, yaitu daftar nilai tukar antara mata uang yang digunakan untuk konversi.

# Extract Method:

Pada metode convert, proses perhitungan nilai konversi dipisah ke dalam sebuah metode extracted. Hal ini dilakukan untuk memudahkan pengujian atau jika perlu dilakukan penyesuaian pada perhitungan tanpa mengubah struktur utama dari convert. Dengan begitu, metode convert tetap pendek dan lebih mudah dipahami.

# Extract Interface:

Antarmuka CurrencyConverter1 dari M2T4 diimplementasikan oleh kelas CurrencyConverter. Antarmuka ini menyediakan contract untuk kelas tersebut, membuatnya lebih fleksibel dan memungkinkan implementasi lain di masa depan. Sebagai contoh, jika ingin menambahkan metode konversi baru atau variasi nilai tukar, cukup buat implementasi baru dari antarmuka CurrencyConverter1.

# Inline Variable:

Tidak tampak inline variable dalam kode ini, tetapi jika variabel yang hanya dipakai sekali ditampilkan, kita bisa menggabungkannya langsung ke dalam ekspresi, misalnya saat memasukkan nilai awal dari exchangeRates.

# Move Method:

Metode convert berada di dalam kelas CurrencyConverter. Pada kasus ini, jika ada kebutuhan, metode ini bisa dipindahkan ke kelas Converter (saat ini kosong), untuk membuat logika konversi berdiri sendiri dan berfokus pada proses konversi, sedangkan kelas CurrencyConverter hanya sebagai pengelola nilai tukar.





