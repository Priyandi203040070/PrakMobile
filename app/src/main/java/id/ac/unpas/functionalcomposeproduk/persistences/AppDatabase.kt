package id.ac.unpas.functionalcomposeproduk.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.functionalcomposeproduk.model.StokProduk

@Database(entities = [StokProduk::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stokProdukDao(): StokProdukDao
}