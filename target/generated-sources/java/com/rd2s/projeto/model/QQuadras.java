package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QQuadras is a Querydsl query type for Quadras
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuadras extends EntityPathBase<Quadras> {

    private static final long serialVersionUID = 790097695L;

    public static final QQuadras quadras = new QQuadras("quadras");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath Nome = createString("Nome");

    public QQuadras(String variable) {
        super(Quadras.class, forVariable(variable));
    }

    public QQuadras(Path<? extends Quadras> path) {
        super(path.getType(), path.getMetadata());
    }

    public QQuadras(PathMetadata metadata) {
        super(Quadras.class, metadata);
    }

}

