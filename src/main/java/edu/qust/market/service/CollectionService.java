package edu.qust.market.service;

import edu.qust.market.bean.Collection;
import edu.qust.market.bean.CollectionExample;
import edu.qust.market.mapper.CategoryMapper;
import edu.qust.market.mapper.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    @Autowired
    private CollectionMapper collectionMapper;

    public List<Collection> selctCollectionByUid(int uid){
        CollectionExample collectionExample = new CollectionExample();
        CollectionExample.Criteria cec = collectionExample.createCriteria();
        cec.andUidEqualTo(uid);
        return collectionMapper.selectByExample(collectionExample);
    }
}
