package database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonDao {

    @Upsert
   suspend fun upsert(person: Person)

    @Delete
   suspend fun delete(person: Person)


    @Query("SELECT * FROM person")
    fun getAllPeople(): Flow<List<Person>>
}