package id.ac.unpas.functionalcomposeproduk.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class StokProduk(
    @PrimaryKey val id: String,
    val kategori: String,
    val nama: String,
    val jumlah: String,
    val tanggal: String,
    val berat: String
)
