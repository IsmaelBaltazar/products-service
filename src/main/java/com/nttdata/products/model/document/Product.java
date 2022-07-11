package com.nttdata.products.model.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.nullability.MaybeNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private long idProduct;
    private String type;
    private String name;
    @MaybeNull
    private Float comission;
    @MaybeNull
    private Boolean limitTransaction;
}
