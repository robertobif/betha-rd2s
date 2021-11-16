package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QHorarios is a Querydsl query type for Horarios
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QHorarios extends EntityPathBase<Horarios> {

    private static final long serialVersionUID = -328321169L;

    public static final QHorarios horarios = new QHorarios("horarios");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    public final StringPath Hora_Fin = createString("Hora_Fin");

    public final StringPath Hora_Ini = createString("Hora_Ini");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QHorarios(String variable) {
        super(Horarios.class, forVariable(variable));
    }

    public QHorarios(Path<? extends Horarios> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHorarios(PathMetadata metadata) {
        super(Horarios.class, metadata);
    }

}

