FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://001-add-ir-receiver-rotary-encoder.patch \
    file://srf04.cfg \
    file://sun20i-gpadc.cfg \
"
