


package edu.yale.library.ladybird.kernel.dao.hibernate;

import edu.yale.library.ladybird.kernel.beans.ImportJobContents;
import edu.yale.library.ladybird.kernel.beans.ImportJobExhead;
import edu.yale.library.ladybird.kernel.dao.ImportJobExheadDAO;
import org.hibernate.Query;

import java.util.List;

public class ImportJobExheadHibernateDAO extends GenericHibernateDAO<ImportJobExhead, Integer> implements ImportJobExheadDAO {

    @SuppressWarnings("unchecked")
    public List<ImportJobExhead> findByImportId(final int arg) {
        Query q = getSession().createQuery("from ImportJobExhead where importId = :param");
        q.setParameter("param", arg);
        return q.list();
    }

    public int getNumEntriesPerImportJob(final int arg) {
        Query q = getSession().createQuery("select count(*) from ImportJobExhead where importId = :param");
        q.setParameter("param", arg);
        return ((Long) q.uniqueResult()).intValue();
    }

}

