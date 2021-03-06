package uploadEmployee.service.intefaces;

import uploadEmployee.entity.TabMapXLSX;
import uploadEmployee.entity.Validation;

import java.util.ArrayList;
import java.util.List;

public interface ValidationInterfaceService extends InterfaceService <Validation> {
    @Override
    void save(Validation obj);

    @Override
    public List<Validation> findAll();

    @Override
    public ArrayList<Validation> findByFieldString(String field, String value);

    @Override
    public Validation findById(int id);

    @Override
    void deleteById(int id);

    @Override
    public ArrayList<Validation> findByFieldInteger(String field, Integer value);

    public ArrayList<Validation> findByTabMapXLSX (TabMapXLSX tabMapXLSX);

    public Validation findByLinkAndFieldString(TabMapXLSX tabMapXLSX, String fieldMap);
}
