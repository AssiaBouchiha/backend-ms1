package  ma.sir.clio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.clio.bean.core.OrderSupplierDeliveryStatus;
import ma.sir.clio.bean.history.OrderSupplierDeliveryStatusHistory;
import ma.sir.clio.dao.criteria.core.OrderSupplierDeliveryStatusCriteria;
import ma.sir.clio.dao.criteria.history.OrderSupplierDeliveryStatusHistoryCriteria;
import ma.sir.clio.service.facade.admin.OrderSupplierDeliveryStatusAdminService;
import ma.sir.clio.ws.converter.OrderSupplierDeliveryStatusConverter;
import ma.sir.clio.ws.dto.OrderSupplierDeliveryStatusDto;
import ma.sir.clio.zynerator.controller.AbstractController;
import ma.sir.clio.zynerator.dto.AuditEntityDto;
import ma.sir.clio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.clio.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.clio.zynerator.dto.FileTempDto;

@Api("Manages orderSupplierDeliveryStatus services")
@RestController
@RequestMapping("/api/admin/orderSupplierDeliveryStatus/")
public class OrderSupplierDeliveryStatusRestAdmin  extends AbstractController<OrderSupplierDeliveryStatus, OrderSupplierDeliveryStatusDto, OrderSupplierDeliveryStatusHistory, OrderSupplierDeliveryStatusCriteria, OrderSupplierDeliveryStatusHistoryCriteria, OrderSupplierDeliveryStatusAdminService, OrderSupplierDeliveryStatusConverter> {



    @ApiOperation("upload one orderSupplierDeliveryStatus")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple orderSupplierDeliveryStatuss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all orderSupplierDeliveryStatuss")
    @GetMapping("")
    public ResponseEntity<List<OrderSupplierDeliveryStatusDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all orderSupplierDeliveryStatuss")
    @GetMapping("optimized")
    public ResponseEntity<List<OrderSupplierDeliveryStatusDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a orderSupplierDeliveryStatus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OrderSupplierDeliveryStatusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  orderSupplierDeliveryStatus")
    @PostMapping("")
    public ResponseEntity<OrderSupplierDeliveryStatusDto> save(@RequestBody OrderSupplierDeliveryStatusDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  orderSupplierDeliveryStatus")
    @PutMapping("")
    public ResponseEntity<OrderSupplierDeliveryStatusDto> update(@RequestBody OrderSupplierDeliveryStatusDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of orderSupplierDeliveryStatus")
    @PostMapping("multiple")
    public ResponseEntity<List<OrderSupplierDeliveryStatusDto>> delete(@RequestBody List<OrderSupplierDeliveryStatusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified orderSupplierDeliveryStatus")
    @DeleteMapping("")
    public ResponseEntity<OrderSupplierDeliveryStatusDto> delete(@RequestBody OrderSupplierDeliveryStatusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified orderSupplierDeliveryStatus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple orderSupplierDeliveryStatuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds orderSupplierDeliveryStatuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<OrderSupplierDeliveryStatusDto>> findByCriteria(@RequestBody OrderSupplierDeliveryStatusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated orderSupplierDeliveryStatuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OrderSupplierDeliveryStatusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierDeliveryStatuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody OrderSupplierDeliveryStatusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets orderSupplierDeliveryStatus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OrderSupplierDeliveryStatusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets orderSupplierDeliveryStatus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets orderSupplierDeliveryStatus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OrderSupplierDeliveryStatusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports orderSupplierDeliveryStatus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OrderSupplierDeliveryStatusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets orderSupplierDeliveryStatus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OrderSupplierDeliveryStatusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public OrderSupplierDeliveryStatusRestAdmin (OrderSupplierDeliveryStatusAdminService service, OrderSupplierDeliveryStatusConverter converter) {
        super(service, converter);
    }


}