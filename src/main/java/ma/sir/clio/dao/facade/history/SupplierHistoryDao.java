package ma.sir.clio.dao.facade.history;

import ma.sir.clio.zynerator.repository.AbstractHistoryRepository;
import ma.sir.clio.bean.history.SupplierHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierHistoryDao extends AbstractHistoryRepository<SupplierHistory,Long> {

}