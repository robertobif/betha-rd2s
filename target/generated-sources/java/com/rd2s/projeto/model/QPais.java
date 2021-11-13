package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPais is a Querydsl query type for Pais
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPais extends EntityPathBase<Pais> {

    private static final long serialVersionUID = 1194714233L;

    public static final QPais pais = new QPais("pais");

    public final com.rd2s.projeto.enterprise.QAbstractRegion _super = new com.rd2s.projeto.enterprise.QAbstractRegion(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> idh = createNumber("idh", Integer.class);

    //inherited
    public final StringPath nome = _super.nome;

    //inherited
    public final StringPath populacao = _super.populacao;

    public QPais(String variable) {
        super(Pais.class, forVariable(variable));
    }

    public QPais(Path<? extends Pais> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPais(PathMetadata metadata) {
        super(Pais.class, metadata);
    }

}

