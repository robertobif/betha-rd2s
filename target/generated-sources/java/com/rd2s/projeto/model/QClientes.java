package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClientes is a Querydsl query type for Clientes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClientes extends EntityPathBase<Clientes> {

    private static final long serialVersionUID = 925940823L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QClientes clientes = new QClientes("clientes");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    public final StringPath bairro = createString("bairro");

    public final StringPath celular = createString("celular");

    public final QCidade cidade;

    public final StringPath cpf = createString("cpf");

    public final StringPath email = createString("email");

    public final StringPath endereco = createString("endereco");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath Nome = createString("Nome");

    public final StringPath telefone = createString("telefone");

    public QClientes(String variable) {
        this(Clientes.class, forVariable(variable), INITS);
    }

    public QClientes(Path<? extends Clientes> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QClientes(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QClientes(PathMetadata metadata, PathInits inits) {
        this(Clientes.class, metadata, inits);
    }

    public QClientes(Class<? extends Clientes> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cidade = inits.isInitialized("cidade") ? new QCidade(forProperty("cidade"), inits.get("cidade")) : null;
    }

}

