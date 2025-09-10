# POSTTEST 1 PEMROGRAMAN BERORIENTASI OBJEK (MANAJEMEN DATA ASET INVESTASI)

Nama: Nabil Daffa Athalasyah
NIM: 2409116090
Kelas: C 2024

# GAMBAR FULL INPUT CODINGAN JAVA
<img width="1308" height="901" alt="Screenshot 2025-09-10 112536" src="https://github.com/user-attachments/assets/6424146d-58a3-4aa2-a41f-e78cd936dd18" />
<img width="1110" height="831" alt="Screenshot 2025-09-10 112609" src="https://github.com/user-attachments/assets/52574064-72b6-4d7d-8d18-e1aa28f2f5c7" />
<img width="1125" height="834" alt="Screenshot 2025-09-10 112626" src="https://github.com/user-attachments/assets/90fac02d-199a-4564-ad4e-6a1d2738d2c7" />

# GAMBAR FULL OUTPUT CODINGAN JAVA
<img width="556" height="223" alt="Screenshot 2025-09-10 110954" src="https://github.com/user-attachments/assets/8ba2fadd-9fad-421a-9e7f-18f29cc198f5" />

# PENJELASAN INPUT CODINGAN JAVA
1). Pada tahap ini, saya telah membuat sebuah project baru di NetBeans dengan nama Nabil Daffa_PostTest1. Di dalam project tersebut, otomatis terbentuk folder Source Packages yang berisi package dengan nama nabil.daffa_posttest1. Selanjutnya, saya membuat sebuah class utama dengan nama NabilDaffa_PostTest1.java yang ditempatkan di dalam package tersebut. Pada bagian atas file, saya menambahkan deklarasi package serta import library ArrayList untuk menyimpan kumpulan data dan Scanner untuk menerima input dari pengguna. Setelah itu, saya mendefinisikan class utama NabilDaffa_PostTest1, yang nantinya akan berisi method main sebagai titik awal eksekusi program.

<img width="341" height="182" alt="Screenshot 2025-09-10 113349" src="https://github.com/user-attachments/assets/8715880c-8842-4697-93b1-a431ad5544c3" />
<img width="495" height="287" alt="Screenshot 2025-09-10 091526" src="https://github.com/user-attachments/assets/f01e2aa0-de55-480c-b0ef-91e15c5846b5" />

2). Pada method main, pertama dibuat sebuah ArrayList bernama aset yang akan digunakan untuk menyimpan data aset investasi dalam bentuk string. Kemudian, dibuat sebuah Scanner bernama input yang berfungsi untuk membaca masukan dari pengguna melalui keyboard. Selanjutnya, terdapat sebuah variabel bertipe integer dengan nama pilihan yang digunakan untuk menyimpan angka menu yang dipilih pengguna.

Pada bagian do { ... }, program menampilkan menu utama berupa daftar pilihan untuk mengelola data aset investasi. Menu tersebut berisi opsi untuk menambah aset, melihat aset, mengubah aset, menghapus aset, dan keluar dari program. Setelah menampilkan menu, program meminta pengguna untuk memasukkan pilihan menu dengan menggunakan input.nextInt(). Setelah itu, diberikan perintah input.nextLine() untuk membersihkan buffer agar input berikutnya tidak terganggu.

Intinya, pada bagian ini adalah struktur dasar tampilan menu interaktif di mana pengguna bisa memilih tindakan yang ingin dilakukan pada data aset investasi.

<img width="489" height="97" alt="Screenshot 2025-09-10 091553" src="https://github.com/user-attachments/assets/c1684d92-8ddb-47ae-a675-db2d8e691eb4" />
<img width="855" height="265" alt="Screenshot 2025-09-10 091600" src="https://github.com/user-attachments/assets/764b57f1-e48f-4445-9065-794e6ee524fd" />

3). Ketika pengguna memilih menu nomor 1, program akan masuk ke blok case 1. Pada bagian ini, program menampilkan judul "Tambah Aset Investasi" agar pengguna tahu sedang berada di menu tambah aset.

Kemudian, program meminta pengguna untuk memasukkan nama aset investasi, misalnya Emas, Saham, Crypto, Obligasi, atau Reksa Dana, melalui perintah System.out.print(). Input dari pengguna dibaca menggunakan input.nextLine() dan disimpan ke dalam variabel namaAset.

Setelah itu, nilai yang dimasukkan pengguna ditambahkan ke dalam ArrayList aset dengan perintah aset.add(namaAset). Hal ini berarti data baru langsung tersimpan di dalam daftar aset yang sedang dikelola oleh program.

Sebagai konfirmasi, program menampilkan pesan "Aset berhasil ditambahkan!" agar pengguna tahu bahwa data yang dimasukkan sudah tercatat. Blok case ini diakhiri dengan break; supaya program tidak melanjutkan ke pilihan menu lain.

Jadi singkatnya, pada bagian ini adalah proses untuk menambahkan data aset baru ke dalam daftar aset investasi yang disimpan dalam ArrayList.

<img width="910" height="191" alt="Screenshot 2025-09-10 091613" src="https://github.com/user-attachments/assets/b9deb706-de3b-45c1-a2b6-507562aaba42" />

4). Pada bagian pilihan 2 (Lihat Aset), program digunakan untuk menampilkan daftar aset investasi yang sudah tersimpan. Pertama, program menampilkan judul “Daftar Aset Investasi” agar pengguna mengetahui menu yang sedang dijalankan. Selanjutnya, program memeriksa apakah daftar aset pada ArrayList masih kosong menggunakan perintah aset.isEmpty(). Jika daftar masih kosong, maka ditampilkan pesan “Belum ada data aset Investasi yang ditambahkan.”. Namun, jika terdapat data, program akan menampilkan seluruh aset yang tersimpan dengan menggunakan perulangan for, di mana setiap aset dicetak lengkap dengan nomor urut dan nama asetnya. Dengan demikian, menu ini berfungsi untuk memudahkan pengguna melihat semua data aset yang sudah dimasukkan sebelumnya.

<img width="812" height="234" alt="Screenshot 2025-09-10 091620" src="https://github.com/user-attachments/assets/cb68a2c4-7639-4d4f-8377-79884ab09d24" />

5). 
