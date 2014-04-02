

package edu.yale.library.ladybird.kernel.dao;

import edu.yale.library.ladybird.kernel.beans.ImportSourceData;

import java.util.List;

public interface ImportSourceDataDAO extends GenericDAO<ImportSourceData, Integer> {

    List<ImportSourceData> findByImportId(int importId);

    List<ImportSourceData> findByImportId(int importId, int rowNum);


}

