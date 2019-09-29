package itx.elastic.demo;

import itx.elastic.demo.dto.EventData;
import itx.elastic.demo.dto.EventId;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

public interface DataService {

    /**
     * Save document data using index provided within {@link EventData} object.
     * Make sure that index of the document is unique. (client generated index)
     * @param eventData
     * @return
     * @throws IOException
     */
    boolean saveData(EventData eventData) throws IOException;

    /**
     * Get document by it's id.
     * @param id
     * @return
     * @throws IOException
     */
    Optional<EventData> getDataById(EventId id) throws IOException;

    /**
     * Get all documents synchronously. (not suitable for big indices)
     * @return
     * @throws IOException
     */
    Collection<EventData> getDataAll() throws IOException;

    /**
     * Delete document by given Id
     * @param id
     * @return
     * @throws IOException
     */
    boolean deleteData(EventId id) throws IOException;

    Collection<EventData> getData(/*query filter*/);

}
