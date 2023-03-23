package id.ac.unpas.functionalcomposeproduk.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcomposeproduk.model.StokProduk

@Dao
interface StokProdukDao {
    @Query("SELECT * FROM StokProduk")
    fun loadAll(): LiveData<List<StokProduk>>
    @Query("SELECT * FROM StokProduk WHERE id = :id")
    fun find(id: String): StokProduk?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: StokProduk)
    @Delete
    fun delete(item: StokProduk)
}